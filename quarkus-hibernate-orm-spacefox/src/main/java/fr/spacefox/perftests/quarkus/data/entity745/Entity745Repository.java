package fr.spacefox.perftests.quarkus.data.entity745;

import fr.spacefox.perftests.quarkus.core.port.data.Entity745DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service745.model.Model745;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity745Repository implements Entity745DatasourcePort, PanacheRepository<Entity745> {
    @Override
    public Optional<Model745> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
