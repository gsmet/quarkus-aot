package fr.spacefox.perftests.quarkus.data.entity140;

import fr.spacefox.perftests.quarkus.core.port.data.Entity140DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service140.model.Model140;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity140Repository implements Entity140DatasourcePort, PanacheRepository<Entity140> {
    @Override
    public Optional<Model140> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
