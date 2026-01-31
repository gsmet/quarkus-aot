package fr.spacefox.perftests.quarkus.core.service574;

import fr.spacefox.perftests.quarkus.core.port.data.Entity574DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service574.model.Model574;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service574 {

    private final Entity574DatasourcePort datasource;

    public Service574(Entity574DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model574 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
