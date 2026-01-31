package fr.spacefox.perftests.quarkus.data.entity769;

import fr.spacefox.perftests.quarkus.core.port.data.Entity769DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service769.model.Model769;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity769Repository implements Entity769DatasourcePort, PanacheRepository<Entity769> {
    @Override
    public Optional<Model769> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
