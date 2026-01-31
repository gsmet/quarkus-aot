package fr.spacefox.perftests.quarkus.data.entity241;

import fr.spacefox.perftests.quarkus.core.port.data.Entity241DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service241.model.Model241;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity241Repository implements Entity241DatasourcePort, PanacheRepository<Entity241> {
    @Override
    public Optional<Model241> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
