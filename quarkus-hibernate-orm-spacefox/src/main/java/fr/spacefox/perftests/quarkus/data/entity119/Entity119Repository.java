package fr.spacefox.perftests.quarkus.data.entity119;

import fr.spacefox.perftests.quarkus.core.port.data.Entity119DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service119.model.Model119;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity119Repository implements Entity119DatasourcePort, PanacheRepository<Entity119> {
    @Override
    public Optional<Model119> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
