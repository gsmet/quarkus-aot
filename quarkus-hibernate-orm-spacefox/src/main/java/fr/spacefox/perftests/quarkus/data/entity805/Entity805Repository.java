package fr.spacefox.perftests.quarkus.data.entity805;

import fr.spacefox.perftests.quarkus.core.port.data.Entity805DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service805.model.Model805;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity805Repository implements Entity805DatasourcePort, PanacheRepository<Entity805> {
    @Override
    public Optional<Model805> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
