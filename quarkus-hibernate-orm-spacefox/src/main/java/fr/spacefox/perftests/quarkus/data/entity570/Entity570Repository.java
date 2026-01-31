package fr.spacefox.perftests.quarkus.data.entity570;

import fr.spacefox.perftests.quarkus.core.port.data.Entity570DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service570.model.Model570;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity570Repository implements Entity570DatasourcePort, PanacheRepository<Entity570> {
    @Override
    public Optional<Model570> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
