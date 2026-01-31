package fr.spacefox.perftests.quarkus.core.service890;

import fr.spacefox.perftests.quarkus.core.port.data.Entity890DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service890.model.Model890;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service890 {

    private final Entity890DatasourcePort datasource;

    public Service890(Entity890DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model890 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
