package fr.spacefox.perftests.quarkus.data.entity580;

import fr.spacefox.perftests.quarkus.core.port.data.Entity580DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service580.model.Model580;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity580Repository implements Entity580DatasourcePort, PanacheRepository<Entity580> {
    @Override
    public Optional<Model580> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
