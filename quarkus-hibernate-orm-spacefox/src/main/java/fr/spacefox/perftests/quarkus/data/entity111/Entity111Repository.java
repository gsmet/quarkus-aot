package fr.spacefox.perftests.quarkus.data.entity111;

import fr.spacefox.perftests.quarkus.core.port.data.Entity111DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service111.model.Model111;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity111Repository implements Entity111DatasourcePort, PanacheRepository<Entity111> {
    @Override
    public Optional<Model111> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
