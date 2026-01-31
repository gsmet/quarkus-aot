package fr.spacefox.perftests.quarkus.data.entity246;

import fr.spacefox.perftests.quarkus.core.port.data.Entity246DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service246.model.Model246;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity246Repository implements Entity246DatasourcePort, PanacheRepository<Entity246> {
    @Override
    public Optional<Model246> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
