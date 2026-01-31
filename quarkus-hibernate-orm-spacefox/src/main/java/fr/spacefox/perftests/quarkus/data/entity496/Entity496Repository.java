package fr.spacefox.perftests.quarkus.data.entity496;

import fr.spacefox.perftests.quarkus.core.port.data.Entity496DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service496.model.Model496;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity496Repository implements Entity496DatasourcePort, PanacheRepository<Entity496> {
    @Override
    public Optional<Model496> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
