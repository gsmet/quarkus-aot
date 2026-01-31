package fr.spacefox.perftests.quarkus.data.entity789;

import fr.spacefox.perftests.quarkus.core.port.data.Entity789DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service789.model.Model789;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity789Repository implements Entity789DatasourcePort, PanacheRepository<Entity789> {
    @Override
    public Optional<Model789> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
