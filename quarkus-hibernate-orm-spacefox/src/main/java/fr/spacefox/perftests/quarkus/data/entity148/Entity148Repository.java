package fr.spacefox.perftests.quarkus.data.entity148;

import fr.spacefox.perftests.quarkus.core.port.data.Entity148DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service148.model.Model148;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity148Repository implements Entity148DatasourcePort, PanacheRepository<Entity148> {
    @Override
    public Optional<Model148> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
