package fr.spacefox.perftests.quarkus.core.service397;

import fr.spacefox.perftests.quarkus.core.port.data.Entity397DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service397.model.Model397;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service397 {

    private final Entity397DatasourcePort datasource;

    public Service397(Entity397DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model397 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
