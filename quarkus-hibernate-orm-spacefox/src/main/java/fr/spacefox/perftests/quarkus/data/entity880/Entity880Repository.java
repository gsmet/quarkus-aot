package fr.spacefox.perftests.quarkus.data.entity880;

import fr.spacefox.perftests.quarkus.core.port.data.Entity880DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service880.model.Model880;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity880Repository implements Entity880DatasourcePort, PanacheRepository<Entity880> {
    @Override
    public Optional<Model880> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
