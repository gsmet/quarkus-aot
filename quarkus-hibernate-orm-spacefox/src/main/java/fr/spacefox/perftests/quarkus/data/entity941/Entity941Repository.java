package fr.spacefox.perftests.quarkus.data.entity941;

import fr.spacefox.perftests.quarkus.core.port.data.Entity941DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service941.model.Model941;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity941Repository implements Entity941DatasourcePort, PanacheRepository<Entity941> {
    @Override
    public Optional<Model941> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
