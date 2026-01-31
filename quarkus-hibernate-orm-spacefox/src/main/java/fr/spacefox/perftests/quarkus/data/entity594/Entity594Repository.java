package fr.spacefox.perftests.quarkus.data.entity594;

import fr.spacefox.perftests.quarkus.core.port.data.Entity594DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service594.model.Model594;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity594Repository implements Entity594DatasourcePort, PanacheRepository<Entity594> {
    @Override
    public Optional<Model594> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
