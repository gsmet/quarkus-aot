package fr.spacefox.perftests.quarkus.core.service590;

import fr.spacefox.perftests.quarkus.core.port.data.Entity590DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service590.model.Model590;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service590 {

    private final Entity590DatasourcePort datasource;

    public Service590(Entity590DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model590 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
