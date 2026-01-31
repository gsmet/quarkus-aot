package fr.spacefox.perftests.quarkus.data.entity652;

import fr.spacefox.perftests.quarkus.core.port.data.Entity652DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service652.model.Model652;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity652Repository implements Entity652DatasourcePort, PanacheRepository<Entity652> {
    @Override
    public Optional<Model652> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
