package fr.spacefox.perftests.quarkus.data.entity674;

import fr.spacefox.perftests.quarkus.core.port.data.Entity674DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service674.model.Model674;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity674Repository implements Entity674DatasourcePort, PanacheRepository<Entity674> {
    @Override
    public Optional<Model674> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
