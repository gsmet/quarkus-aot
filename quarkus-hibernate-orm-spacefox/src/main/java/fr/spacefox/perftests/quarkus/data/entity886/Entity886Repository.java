package fr.spacefox.perftests.quarkus.data.entity886;

import fr.spacefox.perftests.quarkus.core.port.data.Entity886DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service886.model.Model886;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity886Repository implements Entity886DatasourcePort, PanacheRepository<Entity886> {
    @Override
    public Optional<Model886> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
