package fr.spacefox.perftests.quarkus.data.entity79;

import fr.spacefox.perftests.quarkus.core.port.data.Entity79DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service79.model.Model79;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity79Repository implements Entity79DatasourcePort, PanacheRepository<Entity79> {
    @Override
    public Optional<Model79> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
