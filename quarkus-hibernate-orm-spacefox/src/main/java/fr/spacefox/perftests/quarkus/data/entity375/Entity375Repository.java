package fr.spacefox.perftests.quarkus.data.entity375;

import fr.spacefox.perftests.quarkus.core.port.data.Entity375DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service375.model.Model375;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity375Repository implements Entity375DatasourcePort, PanacheRepository<Entity375> {
    @Override
    public Optional<Model375> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
