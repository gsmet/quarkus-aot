package fr.spacefox.perftests.quarkus.data.entity182;

import fr.spacefox.perftests.quarkus.core.port.data.Entity182DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service182.model.Model182;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity182Repository implements Entity182DatasourcePort, PanacheRepository<Entity182> {
    @Override
    public Optional<Model182> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
