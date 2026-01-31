package fr.spacefox.perftests.quarkus.data.entity576;

import fr.spacefox.perftests.quarkus.core.port.data.Entity576DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service576.model.Model576;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity576Repository implements Entity576DatasourcePort, PanacheRepository<Entity576> {
    @Override
    public Optional<Model576> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
