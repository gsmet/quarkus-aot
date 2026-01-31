package fr.spacefox.perftests.quarkus.data.entity152;

import fr.spacefox.perftests.quarkus.core.port.data.Entity152DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service152.model.Model152;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity152Repository implements Entity152DatasourcePort, PanacheRepository<Entity152> {
    @Override
    public Optional<Model152> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
