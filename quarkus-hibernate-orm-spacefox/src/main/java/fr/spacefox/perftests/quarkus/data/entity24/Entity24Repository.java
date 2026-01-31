package fr.spacefox.perftests.quarkus.data.entity24;

import fr.spacefox.perftests.quarkus.core.port.data.Entity24DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service24.model.Model24;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity24Repository implements Entity24DatasourcePort, PanacheRepository<Entity24> {
    @Override
    public Optional<Model24> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
