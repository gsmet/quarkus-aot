package fr.spacefox.perftests.quarkus.data.entity850;

import fr.spacefox.perftests.quarkus.core.port.data.Entity850DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service850.model.Model850;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity850Repository implements Entity850DatasourcePort, PanacheRepository<Entity850> {
    @Override
    public Optional<Model850> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
