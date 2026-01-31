package fr.spacefox.perftests.quarkus.data.entity73;

import fr.spacefox.perftests.quarkus.core.port.data.Entity73DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service73.model.Model73;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity73Repository implements Entity73DatasourcePort, PanacheRepository<Entity73> {
    @Override
    public Optional<Model73> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
