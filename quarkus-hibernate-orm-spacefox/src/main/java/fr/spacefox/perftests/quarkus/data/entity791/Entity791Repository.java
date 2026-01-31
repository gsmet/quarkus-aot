package fr.spacefox.perftests.quarkus.data.entity791;

import fr.spacefox.perftests.quarkus.core.port.data.Entity791DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service791.model.Model791;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity791Repository implements Entity791DatasourcePort, PanacheRepository<Entity791> {
    @Override
    public Optional<Model791> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
