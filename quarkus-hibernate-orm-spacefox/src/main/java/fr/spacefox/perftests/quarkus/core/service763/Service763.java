package fr.spacefox.perftests.quarkus.core.service763;

import fr.spacefox.perftests.quarkus.core.port.data.Entity763DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service763.model.Model763;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service763 {

    private final Entity763DatasourcePort datasource;

    public Service763(Entity763DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model763 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
