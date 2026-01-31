package fr.spacefox.perftests.quarkus.data.entity465;

import fr.spacefox.perftests.quarkus.core.port.data.Entity465DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service465.model.Model465;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity465Repository implements Entity465DatasourcePort, PanacheRepository<Entity465> {
    @Override
    public Optional<Model465> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
