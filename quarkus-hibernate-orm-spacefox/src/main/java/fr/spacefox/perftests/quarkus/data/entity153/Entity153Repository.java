package fr.spacefox.perftests.quarkus.data.entity153;

import fr.spacefox.perftests.quarkus.core.port.data.Entity153DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service153.model.Model153;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity153Repository implements Entity153DatasourcePort, PanacheRepository<Entity153> {
    @Override
    public Optional<Model153> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
