package fr.spacefox.perftests.quarkus.data.entity327;

import fr.spacefox.perftests.quarkus.core.port.data.Entity327DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service327.model.Model327;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity327Repository implements Entity327DatasourcePort, PanacheRepository<Entity327> {
    @Override
    public Optional<Model327> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
