package fr.spacefox.perftests.quarkus.data.entity200;

import fr.spacefox.perftests.quarkus.core.port.data.Entity200DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service200.model.Model200;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity200Repository implements Entity200DatasourcePort, PanacheRepository<Entity200> {
    @Override
    public Optional<Model200> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
