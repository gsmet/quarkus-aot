package fr.spacefox.perftests.quarkus.data.entity699;

import fr.spacefox.perftests.quarkus.core.port.data.Entity699DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service699.model.Model699;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity699Repository implements Entity699DatasourcePort, PanacheRepository<Entity699> {
    @Override
    public Optional<Model699> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
