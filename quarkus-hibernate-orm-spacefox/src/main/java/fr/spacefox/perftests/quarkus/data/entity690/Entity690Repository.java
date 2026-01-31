package fr.spacefox.perftests.quarkus.data.entity690;

import fr.spacefox.perftests.quarkus.core.port.data.Entity690DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service690.model.Model690;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity690Repository implements Entity690DatasourcePort, PanacheRepository<Entity690> {
    @Override
    public Optional<Model690> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
