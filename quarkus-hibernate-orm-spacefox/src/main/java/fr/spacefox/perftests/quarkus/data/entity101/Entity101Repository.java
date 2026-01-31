package fr.spacefox.perftests.quarkus.data.entity101;

import fr.spacefox.perftests.quarkus.core.port.data.Entity101DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service101.model.Model101;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity101Repository implements Entity101DatasourcePort, PanacheRepository<Entity101> {
    @Override
    public Optional<Model101> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
