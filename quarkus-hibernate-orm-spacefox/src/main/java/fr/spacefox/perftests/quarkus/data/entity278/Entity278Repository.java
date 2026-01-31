package fr.spacefox.perftests.quarkus.data.entity278;

import fr.spacefox.perftests.quarkus.core.port.data.Entity278DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service278.model.Model278;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity278Repository implements Entity278DatasourcePort, PanacheRepository<Entity278> {
    @Override
    public Optional<Model278> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
