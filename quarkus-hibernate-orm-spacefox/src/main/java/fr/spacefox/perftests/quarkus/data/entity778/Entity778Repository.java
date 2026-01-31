package fr.spacefox.perftests.quarkus.data.entity778;

import fr.spacefox.perftests.quarkus.core.port.data.Entity778DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service778.model.Model778;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity778Repository implements Entity778DatasourcePort, PanacheRepository<Entity778> {
    @Override
    public Optional<Model778> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
