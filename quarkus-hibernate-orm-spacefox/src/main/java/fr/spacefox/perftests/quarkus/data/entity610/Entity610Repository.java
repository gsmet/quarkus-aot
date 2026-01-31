package fr.spacefox.perftests.quarkus.data.entity610;

import fr.spacefox.perftests.quarkus.core.port.data.Entity610DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service610.model.Model610;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity610Repository implements Entity610DatasourcePort, PanacheRepository<Entity610> {
    @Override
    public Optional<Model610> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
