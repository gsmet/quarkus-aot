package fr.spacefox.perftests.quarkus.data.entity345;

import fr.spacefox.perftests.quarkus.core.port.data.Entity345DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service345.model.Model345;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity345Repository implements Entity345DatasourcePort, PanacheRepository<Entity345> {
    @Override
    public Optional<Model345> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
